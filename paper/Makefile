default all: show

%.ps: %.dvi
	dvips -f $^ > $@

%.pdf: %.dvi
	dvipdf $^ $@

%.dvi: %.tex %.bib
	latex $*
	bibtex $*
	latex $*
	latex $*

clean:
	-rm -f *.aux *.bbl *.blg *.dvi *.log *.pdf *.ps

show: hoj.dvi
	xdvi $<
