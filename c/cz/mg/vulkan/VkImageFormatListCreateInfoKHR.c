#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

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

jlong Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_getViewFormatCount(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->viewFormatCount);
}

void Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_setViewFormatCount(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->viewFormatCount, valuePointer, sizeof(o->viewFormatCount));
}

jlong Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_getPViewFormats(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pViewFormats);
}

void Java_cz_mg_vulkan_VkImageFormatListCreateInfoKHR_setPViewFormats(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImageFormatListCreateInfoKHR* o = (VkImageFormatListCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pViewFormats, &valuePointer, sizeof(o->pViewFormats));
}


