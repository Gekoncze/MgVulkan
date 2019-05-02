#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDisplaySurfaceCreateInfoKHR);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDisplaySurfaceCreateInfoKHR));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getDisplayModeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->displayMode);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setDisplayModeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->displayMode, valuePointer, sizeof(o->displayMode));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getPlaneIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->planeIndex);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setPlaneIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->planeIndex, valuePointer, sizeof(o->planeIndex));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getPlaneStackIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->planeStackIndex);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setPlaneStackIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->planeStackIndex, valuePointer, sizeof(o->planeStackIndex));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getTransformNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->transform);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setTransformNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->transform, valuePointer, sizeof(o->transform));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getGlobalAlphaNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->globalAlpha);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setGlobalAlphaNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->globalAlpha, valuePointer, sizeof(o->globalAlpha));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getAlphaModeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->alphaMode);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setAlphaModeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->alphaMode, valuePointer, sizeof(o->alphaMode));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getImageExtentNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageExtent);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setImageExtentNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageExtent, valuePointer, sizeof(o->imageExtent));
}


