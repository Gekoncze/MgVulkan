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

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getDisplayMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->displayMode);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setDisplayMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->displayMode, valuePointer, sizeof(o->displayMode));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getPlaneIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->planeIndex);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setPlaneIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->planeIndex, valuePointer, sizeof(o->planeIndex));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getPlaneStackIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->planeStackIndex);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setPlaneStackIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->planeStackIndex, valuePointer, sizeof(o->planeStackIndex));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getTransform(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->transform);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setTransform(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->transform, valuePointer, sizeof(o->transform));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getGlobalAlpha(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->globalAlpha);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setGlobalAlpha(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->globalAlpha, valuePointer, sizeof(o->globalAlpha));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getAlphaMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->alphaMode);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setAlphaMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->alphaMode, valuePointer, sizeof(o->alphaMode));
}

jlong Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_getImageExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->imageExtent);
}

void Java_cz_mg_vulkan_VkDisplaySurfaceCreateInfoKHR_setImageExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->imageExtent, valuePointer, sizeof(o->imageExtent));
}


