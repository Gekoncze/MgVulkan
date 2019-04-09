#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkSize_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(size_t);
}

jlong Java_cz_mg_vulkan_VkSize_getValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jlong value;
    memcpy(&value, (size_t*)jniLongToPointer(address), sizeof(size_t));
    return value;
}

void Java_cz_mg_vulkan_VkSize_setValue(JNIEnv* env, jclass jc, jlong address, jlong value)
{
    (void)env;
    (void)jc;
    memcpy((size_t*)jniLongToPointer(address), &value, sizeof(size_t));
}
