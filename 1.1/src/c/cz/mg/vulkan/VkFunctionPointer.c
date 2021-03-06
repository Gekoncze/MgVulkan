#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkFunctionPointer_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(PFN_vkVoidFunction);
}

jlong Java_cz_mg_vulkan_VkFunctionPointer_getValueNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    PFN_vkVoidFunction* pointerAddress = (PFN_vkVoidFunction*)jniLongToPointer(address);
    return jniFunctionPointerToLong(*pointerAddress);
}

void Java_cz_mg_vulkan_VkFunctionPointer_setValueNative(JNIEnv* env, jclass jc, jlong address, jlong value)
{
    (void)env;
    (void)jc;
    PFN_vkVoidFunction* pointerAddress = (PFN_vkVoidFunction*)jniLongToPointer(address);
    *pointerAddress = jniLongToFunctionPointer(value);
}

void Java_cz_mg_vulkan_VkFunctionPointer_loadNative(JNIEnv* env, jclass jc, jlong address, jlong instance, jlong string)
{
    (void)env;
    (void)jc;
    PFN_vkVoidFunction* pointerAddress = (PFN_vkVoidFunction*)jniLongToPointer(address);
    char* stringAddress = (char*)jniLongToPointer(string);
    VkInstance* instanceAddress = (VkInstance*)jniLongToPointer(instance);
    *pointerAddress = vkGetInstanceProcAddr(*instanceAddress, stringAddress);
}
