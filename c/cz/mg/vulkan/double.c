#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDouble_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(double);
}

jdouble Java_cz_mg_vulkan_vk_VkDouble_getValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jdouble value;
    memcpy(&value, (double*)jniLongToPointer(address), sizeof(double));
    return value;
}

void Java_cz_mg_vulkan_vk_VkDouble_setValue(JNIEnv* env, jclass jc, jlong address, jdouble value)
{
    (void)env;
    (void)jc;
    memcpy((double*)jniLongToPointer(address), &value, sizeof(double));
}
