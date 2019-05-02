#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkChar_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(char);
}

void Java_cz_mg_vulkan_VkChar_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(char));
}

jbyte Java_cz_mg_vulkan_VkChar_getValueNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jbyte value;
    memcpy(&value, (char*)jniLongToPointer(address), sizeof(char));
    return value;
}

void Java_cz_mg_vulkan_VkChar_setValueNative(JNIEnv* env, jclass jc, jlong address, jbyte value)
{
    (void)env;
    (void)jc;
    memcpy((char*)jniLongToPointer(address), &value, sizeof(char));
}
