#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_vk_VkMemoryDedicatedRequirements_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkMemoryDedicatedRequirements);
}

jlong Java_cz_mg_vulkan_vk_VkMemoryDedicatedRequirements_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_vk_VkMemoryDedicatedRequirements_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_vk_VkMemoryDedicatedRequirements_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_vk_VkMemoryDedicatedRequirements_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_vk_VkMemoryDedicatedRequirements_getPrefersDedicatedAllocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->prefersDedicatedAllocation);
}

void Java_cz_mg_vulkan_vk_VkMemoryDedicatedRequirements_setPrefersDedicatedAllocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->prefersDedicatedAllocation, valuePointer, sizeof(o->prefersDedicatedAllocation));
}

jlong Java_cz_mg_vulkan_vk_VkMemoryDedicatedRequirements_getRequiresDedicatedAllocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->requiresDedicatedAllocation);
}

void Java_cz_mg_vulkan_vk_VkMemoryDedicatedRequirements_setRequiresDedicatedAllocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->requiresDedicatedAllocation, valuePointer, sizeof(o->requiresDedicatedAllocation));
}


