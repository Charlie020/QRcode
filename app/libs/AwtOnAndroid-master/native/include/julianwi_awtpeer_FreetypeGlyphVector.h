/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class julianwi_awtpeer_FreetypeGlyphVector */

#ifndef _Included_julianwi_awtpeer_FreetypeGlyphVector
#define _Included_julianwi_awtpeer_FreetypeGlyphVector
#ifdef __cplusplus
extern "C" {
#endif
#undef julianwi_awtpeer_FreetypeGlyphVector_FLAG_HAS_TRANSFORMS
#define julianwi_awtpeer_FreetypeGlyphVector_FLAG_HAS_TRANSFORMS 1L
#undef julianwi_awtpeer_FreetypeGlyphVector_FLAG_HAS_POSITION_ADJUSTMENTS
#define julianwi_awtpeer_FreetypeGlyphVector_FLAG_HAS_POSITION_ADJUSTMENTS 2L
#undef julianwi_awtpeer_FreetypeGlyphVector_FLAG_RUN_RTL
#define julianwi_awtpeer_FreetypeGlyphVector_FLAG_RUN_RTL 4L
#undef julianwi_awtpeer_FreetypeGlyphVector_FLAG_COMPLEX_GLYPHS
#define julianwi_awtpeer_FreetypeGlyphVector_FLAG_COMPLEX_GLYPHS 8L
#undef julianwi_awtpeer_FreetypeGlyphVector_FLAG_MASK
#define julianwi_awtpeer_FreetypeGlyphVector_FLAG_MASK 15L
/*
 * Class:     julianwi_awtpeer_FreetypeGlyphVector
 * Method:    getglyphindex
 * Signature: (JI)I
 */
JNIEXPORT jint JNICALL Java_julianwi_awtpeer_FreetypeGlyphVector_getglyphindex
  (JNIEnv *, jobject, jlong, jint);

/*
 * Class:     julianwi_awtpeer_FreetypeGlyphVector
 * Method:    getGlyphOutlineNative
 * Signature: (JI)Ljava/awt/geom/GeneralPath;
 */
JNIEXPORT jobject JNICALL Java_julianwi_awtpeer_FreetypeGlyphVector_getGlyphOutlineNative
  (JNIEnv *, jobject, jlong, jint);

#ifdef __cplusplus
}
#endif
#endif
