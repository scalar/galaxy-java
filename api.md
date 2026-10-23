# Scalar Galaxy Java API

Complete reference of every operation, grouped by resource. See [the README](./README.md) for usage and configuration.

## Contents

- [`Planets`](#planets)
  - [Get all planets](#get-all-planets)
  - [Create a planet](#create-a-planet)
  - [Get a planet](#get-a-planet)
  - [Update a planet](#update-a-planet)
  - [Delete a planet](#delete-a-planet)
  - [Upload an image to a planet](#upload-an-image-to-a-planet)
- [`CelestialBodies`](#celestialbodies)
  - [Create a celestial body](#create-a-celestial-body)
- [`Authentication`](#authentication)
  - [Create a user](#create-a-user)
  - [Get a token](#get-a-token)
  - [Get authenticated user](#get-authenticated-user)

## Setup

```java
import com.scalar.galaxy.client.GalaxyClient;
import com.scalar.galaxy.client.okhttp.GalaxyOkHttpClient;

GalaxyClient client =
    GalaxyOkHttpClient.builder().bearerAuth(System.getenv("BEARER_AUTH")).build();
```

## `Planets`

Everything about planets

### Get all planets

It's easy to say you know them all, but do you really? Retrieve all the planets and check whether you missed one.

| Direction | Type |
| --- | --- |
| Request | [`PlanetListAllDataParams`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/planets/PlanetListAllDataParams.kt) |
| Response | [`PlanetListAllDataResponse`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/planets/PlanetListAllDataResponse.kt) |

```java
import com.scalar.galaxy.client.GalaxyClient;
import com.scalar.galaxy.client.okhttp.GalaxyOkHttpClient;
import com.scalar.galaxy.models.planets.PlanetListAllDataParams;

GalaxyClient client =
    GalaxyOkHttpClient.builder().bearerAuth(System.getenv("BEARER_AUTH")).build();

PlanetListAllDataParams params =
    PlanetListAllDataParams.builder().limit(10L).offset(0L).build();
var planet = client.planets().listAllData(params);

System.out.println(planet);
```

### Create a planet

Time to play god and create a new planet. What do you think? Ah, don't think too much. What could go wrong anyway?

| Direction | Type |
| --- | --- |
| Request | [`PlanetCreateParams`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/planets/PlanetCreateParams.kt) |
| Response | [`Planet`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/planets/Planet.kt) |

```java
import com.scalar.galaxy.client.GalaxyClient;
import com.scalar.galaxy.client.okhttp.GalaxyOkHttpClient;
import com.scalar.galaxy.models.planets.Planet;
import com.scalar.galaxy.models.planets.PlanetCreateParams;

GalaxyClient client =
    GalaxyOkHttpClient.builder().bearerAuth(System.getenv("BEARER_AUTH")).build();

PlanetCreateParams params =
    PlanetCreateParams.builder().planet(Planet.builder().name("Mars").build()).build();
var planet = client.planets().create(params);

System.out.println(planet);
```

### Get a planet

You'll better learn a little bit more about the planets. It might come in handy once space travel is available for everyone.

| Direction | Type |
| --- | --- |
| Request | [`PlanetRetrieveParams`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/planets/PlanetRetrieveParams.kt) |
| Response | [`Planet`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/planets/Planet.kt) |

```java
import com.scalar.galaxy.client.GalaxyClient;
import com.scalar.galaxy.client.okhttp.GalaxyOkHttpClient;
import com.scalar.galaxy.models.planets.PlanetRetrieveParams;

GalaxyClient client =
    GalaxyOkHttpClient.builder().bearerAuth(System.getenv("BEARER_AUTH")).build();

PlanetRetrieveParams params = PlanetRetrieveParams.builder().planetId(1L).build();
var planet = client.planets().retrieve(params);

System.out.println(planet);
```

### Update a planet

Sometimes you make mistakes, that's fine. No worries, you can update all planets.

| Direction | Type |
| --- | --- |
| Request | [`PlanetUpdateParams`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/planets/PlanetUpdateParams.kt) |
| Response | [`Planet`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/planets/Planet.kt) |

```java
import com.scalar.galaxy.client.GalaxyClient;
import com.scalar.galaxy.client.okhttp.GalaxyOkHttpClient;
import com.scalar.galaxy.models.planets.Planet;
import com.scalar.galaxy.models.planets.PlanetUpdateParams;

GalaxyClient client =
    GalaxyOkHttpClient.builder().bearerAuth(System.getenv("BEARER_AUTH")).build();

PlanetUpdateParams params =
    PlanetUpdateParams.builder()
        .planetId(1L)
        .planet(Planet.builder().name("Mars").build())
        .build();
var planet = client.planets().update(params);

System.out.println(planet);
```

### Delete a planet

This endpoint was used to delete planets. Unfortunately, that caused a lot of trouble for planets with life. So, this endpoint is now deprecated and should not be used anymore.

| Direction | Type |
| --- | --- |
| Request | [`PlanetDeleteParams`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/planets/PlanetDeleteParams.kt) |

```java
import com.scalar.galaxy.client.GalaxyClient;
import com.scalar.galaxy.client.okhttp.GalaxyOkHttpClient;
import com.scalar.galaxy.models.planets.PlanetDeleteParams;

GalaxyClient client =
    GalaxyOkHttpClient.builder().bearerAuth(System.getenv("BEARER_AUTH")).build();

PlanetDeleteParams params = PlanetDeleteParams.builder().planetId(1L).build();
client.planets().delete(params);
```

### Upload an image to a planet

Got a crazy good photo of a planet? Share it with the world!

| Direction | Type |
| --- | --- |
| Request | [`PlanetDelteImageParams`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/planets/PlanetDelteImageParams.kt) |
| Response | [`PlanetDelteImageResponse`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/planets/PlanetDelteImageResponse.kt) |

```java
import com.scalar.galaxy.client.GalaxyClient;
import com.scalar.galaxy.client.okhttp.GalaxyOkHttpClient;
import com.scalar.galaxy.models.planets.PlanetDelteImageParams;

GalaxyClient client =
    GalaxyOkHttpClient.builder().bearerAuth(System.getenv("BEARER_AUTH")).build();

PlanetDelteImageParams params = PlanetDelteImageParams.builder().planetId(1L).build();
var planet = client.planets().delteImage(params);

System.out.println(planet);
```

## `CelestialBodies`

Celestial bodies are the planets and satellites in the Scalar Galaxy.

### Create a celestial body

Stars, moons, comets, the occasional rogue asteroid — if it glows or drifts through the void, you can add it here.

| Direction | Type |
| --- | --- |
| Request | [`CelestialBodyCreateParams`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/celestialbodies/CelestialBodyCreateParams.kt) |
| Response | [`CelestialBody`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/celestialbodies/CelestialBody.kt) |

```java
import com.scalar.galaxy.client.GalaxyClient;
import com.scalar.galaxy.client.okhttp.GalaxyOkHttpClient;
import com.scalar.galaxy.models.celestialbodies.CelestialBody;
import com.scalar.galaxy.models.celestialbodies.CelestialBodyCreateParams;
import com.scalar.galaxy.models.planets.Planet;

GalaxyClient client =
    GalaxyOkHttpClient.builder().bearerAuth(System.getenv("BEARER_AUTH")).build();

CelestialBodyCreateParams params =
    CelestialBodyCreateParams.builder()
        .celestialBody(CelestialBody.ofPlanet(Planet.builder().name("Mars").build()))
        .build();
var celestialBody = client.celestialBodies().create(params);

System.out.println(celestialBody);
```

## `Authentication`

Some endpoints are public, but some require authentication. We provide all the required endpoints to create an account and authorize yourself.

### Create a user

Time to create a user account, eh?

| Direction | Type |
| --- | --- |
| Request | [`AuthenticationCreateUserParams`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/authentication/AuthenticationCreateUserParams.kt) |
| Response | [`User`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/authentication/User.kt) |

```java
import com.scalar.galaxy.client.GalaxyClient;
import com.scalar.galaxy.client.okhttp.GalaxyOkHttpClient;
import com.scalar.galaxy.models.authentication.AuthenticationCreateUserParams;

GalaxyClient client =
    GalaxyOkHttpClient.builder().bearerAuth(System.getenv("BEARER_AUTH")).build();

AuthenticationCreateUserParams params =
    AuthenticationCreateUserParams.builder()
        .name("Marc")
        .email("marc@scalar.com")
        .password("i-love-scalar")
        .build();
var authentication = client.authentication().createUser(params);

System.out.println(authentication);
```

### Get a token

Yeah, this is the boring security stuff. Just get your super secret token and move on.

| Direction | Type |
| --- | --- |
| Request | [`AuthenticationCreateTokenParams`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/authentication/AuthenticationCreateTokenParams.kt) |
| Response | [`AuthenticationCreateTokenResponse`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/authentication/AuthenticationCreateTokenResponse.kt) |

```java
import com.scalar.galaxy.client.GalaxyClient;
import com.scalar.galaxy.client.okhttp.GalaxyOkHttpClient;
import com.scalar.galaxy.models.authentication.AuthenticationCreateTokenParams;
import com.scalar.galaxy.models.authentication.Credentials;

GalaxyClient client =
    GalaxyOkHttpClient.builder().bearerAuth(System.getenv("BEARER_AUTH")).build();

AuthenticationCreateTokenParams params =
    AuthenticationCreateTokenParams.builder()
        .credentials(
            Credentials.builder().email("marc@scalar.com").password("i-love-scalar").build())
        .build();
var authentication = client.authentication().createToken(params);

System.out.println(authentication);
```

### Get authenticated user

Find yourself they say. That's what you can do here.

| Direction | Type |
| --- | --- |
| Request | [`AuthenticationListMeParams`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/authentication/AuthenticationListMeParams.kt) |
| Response | [`User`](./galaxy-java-core/src/main/kotlin/com/scalar/galaxy/models/authentication/User.kt) |

```java
import com.scalar.galaxy.client.GalaxyClient;
import com.scalar.galaxy.client.okhttp.GalaxyOkHttpClient;

GalaxyClient client =
    GalaxyOkHttpClient.builder().bearerAuth(System.getenv("BEARER_AUTH")).build();

var authentication = client.authentication().listMe();

System.out.println(authentication);
```
