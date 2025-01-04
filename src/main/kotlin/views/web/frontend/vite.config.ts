import {defineConfig} from 'vite'
import react from '@vitejs/plugin-react'

export default defineConfig({
    plugins: [react()],
    server: {
        proxy: {
            '/game-state': {
                target: 'ws://localhost:8080',
                ws: true,
            }
        }
    }
})