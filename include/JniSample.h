/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class JniSample */

#ifndef _Included_JniSample
#define _Included_JniSample
#ifdef __cplusplus
extern "C" {
#endif
/*
 * Class:     JniSample
 * Method:    exp
 * Signature: (D)D
 */
JNIEXPORT jdouble JNICALL Java_com_jnisample_JniSample_exp
  (JNIEnv *, jobject, jdouble);

/*
 * Class:     JniSample
 * Method:    strcmp
 * Signature: (Ljava/lang/String;Ljava/lang/String;)Z
 */
JNIEXPORT jboolean JNICALL Java_com_jnisample_JniSample_strcmp
  (JNIEnv *, jobject, jstring, jstring);

#ifdef __cplusplus
}
#endif
#endif
