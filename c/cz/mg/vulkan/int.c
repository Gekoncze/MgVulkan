#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkInt_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(int);
}

jint Java_cz_mg_vulkan_vk_VkInt_getValue(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    jint value;
    memcpy(&value, (int*)jniLongToPointer(address), sizeof(int));
    return value;
}

void Java_cz_mg_vulkan_vk_VkInt_setValue(JNIEnv* env, jclass jc, jlong address, jint value)
{
    (void)env;
    (void)jc;
    memcpy((int*)jniLongToPointer(address), &value, sizeof(int));
}
