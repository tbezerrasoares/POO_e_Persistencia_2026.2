# ==========================================
# MAKEFILE - TECHLAB INVENTORY (WITH CLASS DIR)
# ==========================================

# Configurações de Compilação
JC = javac
JVM = java
SRC_DIR = Techlab
BIN_DIR = Techlab/Class
MAIN_CLASS = Techlab.Main

# Alvo padrão: Compila todos os arquivos .java e envia os binários para a pasta Class
all:
	@echo "Compilando arquivos Java de '$(SRC_DIR)' e enviando para '$(BIN_DIR)'..."
	@mkdir -p $(BIN_DIR)
	$(JC) -d $(BIN_DIR) $(SRC_DIR)/*.java

# Alvo de Execução: Compila (se necessário) e executa especificando o Classpath (-cp)
run: all
	@echo "Iniciando a aplicação..."
	$(JVM) -cp $(BIN_DIR) $(MAIN_CLASS)

# Alvo de Limpeza: Remove a pasta Class inteira com os arquivos compilados
clean:
	@echo "Removendo a pasta '$(BIN_DIR)' e limpando o projeto..."
	rm -rf $(BIN_DIR)
