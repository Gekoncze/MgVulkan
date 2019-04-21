#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkUInt16_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(uint16_t);
}

jshort Java_cz_mg_vulkan_VkUInt16_getValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jshort value;
    memcpy(&value, (uint16_t*)jniLongToPointer(address), sizeof(uint16_t));
    return value;
}

void Java_cz_mg_vulkan_VkUInt16_setValue(JNIEnv* env, jclass jc, jlong address, jshort value)
{
    (void)env;
    (void)jc;
    memcpy((uint16_t*)jniLongToPointer(address), &value, sizeof(uint16_t));
}
