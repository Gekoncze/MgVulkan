#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkInt_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(int);
}

void Java_cz_mg_vulkan_VkInt_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(int));
}

jint Java_cz_mg_vulkan_VkInt_getValueNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jint value;
    memcpy(&value, (int*)jniLongToPointer(address), sizeof(int));
    return value;
}

void Java_cz_mg_vulkan_VkInt_setValueNative(JNIEnv* env, jclass jc, jlong address, jint value)
{
    (void)env;
    (void)jc;
    memcpy((int*)jniLongToPointer(address), &value, sizeof(int));
}
