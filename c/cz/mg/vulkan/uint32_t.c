#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkUInt32_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(uint32_t);
}

jint Java_cz_mg_vulkan_vk_VkUInt32_getValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jint value;
    memcpy(&value, (uint32_t*)jniLongToPointer(address), sizeof(uint32_t));
    return value;
}

void Java_cz_mg_vulkan_vk_VkUInt32_setValue(JNIEnv* env, jclass jc, jlong address, jint value)
{
    (void)env;
    (void)jc;
    memcpy((uint32_t*)jniLongToPointer(address), &value, sizeof(uint32_t));
}
