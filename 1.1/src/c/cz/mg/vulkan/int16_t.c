#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkInt16_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(int16_t);
}

jshort Java_cz_mg_vulkan_VkInt16_getValueNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jshort value;
    memcpy(&value, (int16_t*)jniLongToPointer(address), sizeof(int16_t));
    return value;
}

void Java_cz_mg_vulkan_VkInt16_setValueNative(JNIEnv* env, jclass jc, jlong address, jshort value)
{
    (void)env;
    (void)jc;
    memcpy((int16_t*)jniLongToPointer(address), &value, sizeof(int16_t));
}
