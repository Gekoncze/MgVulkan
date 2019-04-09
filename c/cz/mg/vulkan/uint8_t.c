#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkUInt8_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(uint8_t);
}

jbyte Java_cz_mg_vulkan_VkUInt8_getValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jbyte value;
    memcpy(&value, (uint8_t*)jniLongToPointer(address), sizeof(uint8_t));
    return value;
}

void Java_cz_mg_vulkan_VkUInt8_setValue(JNIEnv* env, jclass jc, jlong address, jbyte value)
{
    (void)env;
    (void)jc;
    memcpy((uint8_t*)jniLongToPointer(address), &value, sizeof(uint8_t));
}
