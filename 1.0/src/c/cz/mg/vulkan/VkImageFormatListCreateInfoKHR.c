#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImageFormatListCreateInfoKHR);
}

jlong Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_getViewFormatCountNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->viewFormatCount);
}

void Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_setViewFormatCountNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->viewFormatCount, valuePointer, sizeof(o->viewFormatCount));
}

jlong Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_getPViewFormatsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pViewFormats);
}

void Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_setPViewFormatsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pViewFormats, &valuePointer, sizeof(o->pViewFormats));
}


