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

jbyte Java_cz_mg_vulkan_VkChar_getValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jbyte value;
    memcpy(&value, (char*)jniLongToPointer(address), sizeof(char));
    return value;
}

void Java_cz_mg_vulkan_VkChar_setValue(JNIEnv* env, jclass jc, jlong address, jbyte value)
{
    (void)env;
    (void)jc;
    memcpy((char*)jniLongToPointer(address), &value, sizeof(char));
}
