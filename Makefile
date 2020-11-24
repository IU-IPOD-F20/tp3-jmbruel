#-----------------------------------------------------
# Some usefull instructions...
#
BIBLIO=biblio.bib
#-----------------------------------------------------

all: README.html README.pdf

README.html: README.adoc
	asciidoctor -a toc=left README.adoc

README.pdf: README.adoc
	asciidoctor-pdf README.adoc

todos: 
	@echo "========================================"
	@echo "==> Generating the list of today's totos"
	grep "^fix " README.adoc 

check: 
	@echo "========================================"
	@echo "==> checking the fix "
	ruby tests/testfix0.rb README.adoc 
	ruby tests/testfix11.rb 

cleanrepo:
	 git filter-branch --tree-filter 'rm -rf folder' -- --all 

clean:
	rm -rf target
	rm -rf build
	rm .DS_Store
	rm -rf out
