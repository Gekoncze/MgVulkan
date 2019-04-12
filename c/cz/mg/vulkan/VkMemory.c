#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

#include <stdio.h>
#include <stdlib.h>

jlong Java_cz_mg_vulkan_VkMemory_malloc(JNIEnv* env, jclass jc, jlong size)
{
    (void)env;
    (void)jc;
    if(size < 1) size = 1;
    void* pointer = calloc(1, (size_t)size);
    if(pointer == NULL) jniThrowException(env, "malloc failed");
    jlong address = jniPointerToLong(pointer);
    return address;
}

void Java_cz_mg_vulkan_VkMemory_free(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    void* pointer = jniLongToPointer(address);
    free(pointer);
}
