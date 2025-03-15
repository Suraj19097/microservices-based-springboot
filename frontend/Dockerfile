# Use an official Nginx image
FROM nginx:alpine

# Set the working directory
WORKDIR /usr/share/nginx/html

# Remove default Nginx index file
RUN rm -rf ./*

# Copy frontend files into the Nginx serving directory
COPY templates/ .

# Expose port 80 for the web server
EXPOSE 80

# Start Nginx server
CMD ["nginx", "-g", "daemon off;"]
