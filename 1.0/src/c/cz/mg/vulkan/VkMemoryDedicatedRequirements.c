#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkMemoryDedicatedRequirements_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkMemoryDedicatedRequirements);
}

void Java_cz_mg_vulkan_VkMemoryDedicatedRequirements_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkMemoryDedicatedRequirements));
}

jlong Java_cz_mg_vulkan_VkMemoryDedicatedRequirements_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkMemoryDedicatedRequirements_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkMemoryDedicatedRequirements_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkMemoryDedicatedRequirements_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkMemoryDedicatedRequirements_getPrefersDedicatedAllocationNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->prefersDedicatedAllocation);
}

void Java_cz_mg_vulkan_VkMemoryDedicatedRequirements_setPrefersDedicatedAllocationNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->prefersDedicatedAllocation, valuePointer, sizeof(o->prefersDedicatedAllocation));
}

jlong Java_cz_mg_vulkan_VkMemoryDedicatedRequirements_getRequiresDedicatedAllocationNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    return jniPointerToLong(&o->requiresDedicatedAllocation);
}

void Java_cz_mg_vulkan_VkMemoryDedicatedRequirements_setRequiresDedicatedAllocationNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryDedicatedRequirements* o = (VkMemoryDedicatedRequirements*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->requiresDedicatedAllocation, valuePointer, sizeof(o->requiresDedicatedAllocation));
}


