#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkInt8_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(int8_t);
}

jbyte Java_cz_mg_vulkan_vk_VkInt8_getValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jbyte value;
    memcpy(&value, (int8_t*)jniLongToPointer(address), sizeof(int8_t));
    return value;
}

void Java_cz_mg_vulkan_vk_VkInt8_setValue(JNIEnv* env, jclass jc, jlong address, jbyte value)
{
    (void)env;
    (void)jc;
    memcpy((int8_t*)jniLongToPointer(address), &value, sizeof(int8_t));
}
