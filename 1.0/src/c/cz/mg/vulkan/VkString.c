#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jint Java_cz_mg_vulkan_VkString_count(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    char* array = (char*)jniLongToPointer(address);
    return (jint) strlen(array);
}
