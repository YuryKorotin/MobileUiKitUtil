package network_layer.repositories

import io.ktor.client.call.*
import io.ktor.client.statement.*
import network_layer.FigmaClient
import network_layer.models.components.ComponentsResponse
import network_layer.models.images.ImagesResponse
import network_layer.models.nodes.NodesResponse
import network_layer.models.styles.FigmaStylesResponse

class FigmaRepository(private val figmaClient: FigmaClient,
                      private val isLogging: Boolean = false) {
    suspend fun getComponents(fileId: String): ComponentsResponse {
        val response = figmaClient.getComponents(fileId)

        if (isLogging) {
            println(response.bodyAsText())
        }

        return response.body()
    }

    suspend fun getNodes(fileId: String, ids: List<String>): NodesResponse {
        val response = figmaClient.getNodes(fileId, ids)

        if (isLogging) {
            println(response.bodyAsText())
        }

        return response.body()
    }

    suspend fun getStyles(fileId: String): FigmaStylesResponse {
        val stylesResponse = figmaClient.getStyles(fileId)

        val body: FigmaStylesResponse = stylesResponse.body()

        if (isLogging) {
            println(stylesResponse.bodyAsText())
        }

        return body
    }

    suspend fun getImages(fileId: String,
                          ids: List<String>,
                          format: String = "svg",
                          scale: String = ""): ImagesResponse {
        val imagesResponse = figmaClient.getImages(fileId, format, ids, scale)

        val body: ImagesResponse = imagesResponse.body()

        if (isLogging) {
            println(imagesResponse.bodyAsText())
        }

        return body
    }
}