#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkUInt64_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(uint64_t);
}

jlong Java_cz_mg_vulkan_VkUInt64_getValueNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jlong value;
    memcpy(&value, (uint64_t*)jniLongToPointer(address), sizeof(uint64_t));
    return value;
}

void Java_cz_mg_vulkan_VkUInt64_setValueNative(JNIEnv* env, jclass jc, jlong address, jlong value)
{
    (void)env;
    (void)jc;
    memcpy((uint64_t*)jniLongToPointer(address), &value, sizeof(uint64_t));
}
