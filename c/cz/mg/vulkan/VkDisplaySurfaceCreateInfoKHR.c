#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDisplaySurfaceCreateInfoKHR);
}

jlong Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->sType));
}

void Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->sType, jniLongToPointer(valueAddress), sizeof(o->sType));
}
jlong Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->pNext));
}

void Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->pNext, jniLongToPointer(valueAddress), sizeof(o->pNext));
}
jlong Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_getFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->flags));
}

void Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_setFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->flags, jniLongToPointer(valueAddress), sizeof(o->flags));
}
jlong Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_getDisplayMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->displayMode));
}

void Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_setDisplayMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->displayMode, jniLongToPointer(valueAddress), sizeof(o->displayMode));
}
jlong Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_getPlaneIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->planeIndex));
}

void Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_setPlaneIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->planeIndex, jniLongToPointer(valueAddress), sizeof(o->planeIndex));
}
jlong Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_getPlaneStackIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->planeStackIndex));
}

void Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_setPlaneStackIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->planeStackIndex, jniLongToPointer(valueAddress), sizeof(o->planeStackIndex));
}
jlong Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_getTransform(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->transform));
}

void Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_setTransform(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->transform, jniLongToPointer(valueAddress), sizeof(o->transform));
}
jlong Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_getGlobalAlpha(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->globalAlpha));
}

void Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_setGlobalAlpha(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->globalAlpha, jniLongToPointer(valueAddress), sizeof(o->globalAlpha));
}
jlong Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_getAlphaMode(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->alphaMode));
}

void Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_setAlphaMode(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->alphaMode, jniLongToPointer(valueAddress), sizeof(o->alphaMode));
}
jlong Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_getImageExtent(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&(o->imageExtent));
}

void Java_cz_mg_vulkan_vk_VkDisplaySurfaceCreateInfoKHR_setImageExtent(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDisplaySurfaceCreateInfoKHR* o = (VkDisplaySurfaceCreateInfoKHR*)jniLongToPointer(address);
    memcpy(&o->imageExtent, jniLongToPointer(valueAddress), sizeof(o->imageExtent));
}

