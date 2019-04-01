#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkAllocationCallbacks_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkAllocationCallbacks);
}

jlong Java_cz_mg_vulkan_vk_VkAllocationCallbacks_getPUserData(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAllocationCallbacks* o = (VkAllocationCallbacks*)jniLongToPointer(address);
    return jniPointerToLong(o->pUserData);
}

void Java_cz_mg_vulkan_vk_VkAllocationCallbacks_setPUserData(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAllocationCallbacks* o = (VkAllocationCallbacks*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pUserData, &valuePointer, sizeof(o->pUserData));
}

jlong Java_cz_mg_vulkan_vk_VkAllocationCallbacks_getPfnAllocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAllocationCallbacks* o = (VkAllocationCallbacks*)jniLongToPointer(address);
    return jniPointerToLong(&o->pfnAllocation);
}

void Java_cz_mg_vulkan_vk_VkAllocationCallbacks_setPfnAllocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAllocationCallbacks* o = (VkAllocationCallbacks*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pfnAllocation, valuePointer, sizeof(o->pfnAllocation));
}

jlong Java_cz_mg_vulkan_vk_VkAllocationCallbacks_getPfnReallocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAllocationCallbacks* o = (VkAllocationCallbacks*)jniLongToPointer(address);
    return jniPointerToLong(&o->pfnReallocation);
}

void Java_cz_mg_vulkan_vk_VkAllocationCallbacks_setPfnReallocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAllocationCallbacks* o = (VkAllocationCallbacks*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pfnReallocation, valuePointer, sizeof(o->pfnReallocation));
}

jlong Java_cz_mg_vulkan_vk_VkAllocationCallbacks_getPfnFree(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAllocationCallbacks* o = (VkAllocationCallbacks*)jniLongToPointer(address);
    return jniPointerToLong(&o->pfnFree);
}

void Java_cz_mg_vulkan_vk_VkAllocationCallbacks_setPfnFree(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAllocationCallbacks* o = (VkAllocationCallbacks*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pfnFree, valuePointer, sizeof(o->pfnFree));
}

jlong Java_cz_mg_vulkan_vk_VkAllocationCallbacks_getPfnInternalAllocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAllocationCallbacks* o = (VkAllocationCallbacks*)jniLongToPointer(address);
    return jniPointerToLong(&o->pfnInternalAllocation);
}

void Java_cz_mg_vulkan_vk_VkAllocationCallbacks_setPfnInternalAllocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAllocationCallbacks* o = (VkAllocationCallbacks*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pfnInternalAllocation, valuePointer, sizeof(o->pfnInternalAllocation));
}

jlong Java_cz_mg_vulkan_vk_VkAllocationCallbacks_getPfnInternalFree(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkAllocationCallbacks* o = (VkAllocationCallbacks*)jniLongToPointer(address);
    return jniPointerToLong(&o->pfnInternalFree);
}

void Java_cz_mg_vulkan_vk_VkAllocationCallbacks_setPfnInternalFree(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkAllocationCallbacks* o = (VkAllocationCallbacks*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pfnInternalFree, valuePointer, sizeof(o->pfnInternalFree));
}


