#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDisplayPlaneCapabilitiesKHR);
}

jlong Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_getSupportedAlpha(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->supportedAlpha));
}

void Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_setSupportedAlpha(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->supportedAlpha, jniLongToPointer(valueAddress), sizeof(o->supportedAlpha));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_getMinSrcPosition(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minSrcPosition));
}

void Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_setMinSrcPosition(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->minSrcPosition, jniLongToPointer(valueAddress), sizeof(o->minSrcPosition));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_getMaxSrcPosition(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxSrcPosition));
}

void Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_setMaxSrcPosition(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->maxSrcPosition, jniLongToPointer(valueAddress), sizeof(o->maxSrcPosition));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_getMinSrcExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minSrcExtent));
}

void Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_setMinSrcExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->minSrcExtent, jniLongToPointer(valueAddress), sizeof(o->minSrcExtent));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_getMaxSrcExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxSrcExtent));
}

void Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_setMaxSrcExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->maxSrcExtent, jniLongToPointer(valueAddress), sizeof(o->maxSrcExtent));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_getMinDstPosition(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minDstPosition));
}

void Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_setMinDstPosition(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->minDstPosition, jniLongToPointer(valueAddress), sizeof(o->minDstPosition));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_getMaxDstPosition(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDstPosition));
}

void Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_setMaxDstPosition(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->maxDstPosition, jniLongToPointer(valueAddress), sizeof(o->maxDstPosition));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_getMinDstExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->minDstExtent));
}

void Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_setMinDstExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->minDstExtent, jniLongToPointer(valueAddress), sizeof(o->minDstExtent));
}
jlong Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_getMaxDstExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->maxDstExtent));
}

void Java_cz_mg_vulkan_vk_VkDisplayPlaneCapabilitiesKHR_setMaxDstExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplayPlaneCapabilitiesKHR* o = (VkDisplayPlaneCapabilitiesKHR*)jniLongToPointer(address);
    memcpy(&o->maxDstExtent, jniLongToPointer(valueAddress), sizeof(o->maxDstExtent));
}

