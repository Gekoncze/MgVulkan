#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkFloat_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(float);
}

void Java_cz_mg_vulkan_VkFloat_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(float));
}

jfloat Java_cz_mg_vulkan_VkFloat_getValueNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jfloat value;
    memcpy(&value, (float*)jniLongToPointer(address), sizeof(float));
    return value;
}

void Java_cz_mg_vulkan_VkFloat_setValueNative(JNIEnv* env, jclass jc, jlong address, jfloat value)
{
    (void)env;
    (void)jc;
    memcpy((float*)jniLongToPointer(address), &value, sizeof(float));
}
