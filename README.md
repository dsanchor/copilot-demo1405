# Documentación de la API

## Endpoints

### 1. Reverse Text

Este endpoint invierte el texto proporcionado.

**URL**: `/api/reverse`

**Método**: `GET`

**Parámetros de consulta**:

- `text`: El texto a invertir.

**Ejemplo de uso con cURL**:

```bash
curl -X GET 'http://localhost:8080/api/reverse?text=example

'


```

### 2. Disemvowel Text

Este endpoint elimina todas las vocales del texto proporcionado.

**URL**: `/api/disemvowel`

**Método**: `GET`

**Parámetros de consulta**:

- `text`: El texto a desvocalizar.

**Ejemplo de uso con cURL**:

```bash
curl -X GET 'http://localhost:8080/api/disemvowel?text=example'
```

### 3. Palindrome Text

Este endpoint verifica si el texto proporcionado es un palíndromo.

**URL**: `/api/palindrome`

**Método**: `GET`

**Parámetros de consulta**:

- `text`: El texto a verificar.

**Ejemplo de uso con cURL**:

```bash
curl -X GET 'http://localhost:8080/api/palindrome?text=example'
```
