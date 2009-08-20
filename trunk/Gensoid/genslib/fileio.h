
#ifdef __cplusplus
extern "C" {
#endif

#ifndef _FILEIO_H_
#define _FILEIO_H_

/* Global variables */
extern int cart_size;
extern char cart_name[0x100];

/* Function prototypes */
void get_archive_filename(char *filename, char *longfilename);
int get_archive_crc(char *filename);
int load_archive(char *filename, char *buffer, int *file_size);
int load_cart(char *filename);
int check_zip(char *filename);
int gzsize(gzFile *gd);
int save_archive(char *filename, char *buffer, int size);
#endif /* _FILEIO_H_ */

#ifdef __cplusplus
} // End of extern "C"
#endif

