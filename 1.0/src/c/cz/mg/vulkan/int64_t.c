#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkInt64_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(int64_t);
}

jlong Java_cz_mg_vulkan_VkInt64_getValueNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jlong value;
    memcpy(&value, (int64_t*)jniLongToPointer(address), sizeof(int64_t));
    return value;
}

void Java_cz_mg_vulkan_VkInt64_setValueNative(JNIEnv* env, jclass jc, jlong address, jlong value)
{
    (void)env;
    (void)jc;
    memcpy((int64_t*)jniLongToPointer(address), &value, sizeof(int64_t));
}
