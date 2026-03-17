const apiBaseUrl = import.meta.env.VITE_API_BASE_URL;

export async function login() {
  const response = await fetch(`${apiBaseUrl}/auth/login`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify({
      username: "demo",
      password: "demo"
    })
  });

  return response.json();
}
