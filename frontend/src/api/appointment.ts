const apiBaseUrl = import.meta.env.VITE_API_BASE_URL;

export function getAppointmentsEndpoint() {
  return `${apiBaseUrl}/appointments`;
}
