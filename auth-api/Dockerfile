FROM node:18.16.0

WORKDIR /app

COPY package*.json ./

RUN yarn install --production

COPY . .

EXPOSE 8080

CMD ["node", "app.js"]