<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/> 
    <xsl:template match="/">
        <html>
            <body>
 
                <h2>Mis Libros</h2>
                <table border="1">
                    <tr bgcolor="skyblue">
                        <th>Titulo</th>
                        <th>Autor</th>
                        <th>ISBN</th> 
                    </tr>
                    <xsl:for-each select="result/item">
                        <tr>
                            <td>
                                <xsl:value-of select="titulo"/>
                            </td>
                            <td>
                                <xsl:value-of select="autor"/>
                            </td>
                            <td>
                                <xsl:value-of select="isbn"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>