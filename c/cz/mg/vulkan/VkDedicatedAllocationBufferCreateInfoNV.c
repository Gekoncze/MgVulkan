#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDedicatedAllocationBufferCreateInfoNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDedicatedAllocationBufferCreateInfoNV);
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationBufferCreateInfoNV_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationBufferCreateInfoNV* o = (VkDedicatedAllocationBufferCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationBufferCreateInfoNV_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationBufferCreateInfoNV* o = (VkDedicatedAllocationBufferCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationBufferCreateInfoNV_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationBufferCreateInfoNV* o = (VkDedicatedAllocationBufferCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationBufferCreateInfoNV_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationBufferCreateInfoNV* o = (VkDedicatedAllocationBufferCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationBufferCreateInfoNV_getDedicatedAllocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationBufferCreateInfoNV* o = (VkDedicatedAllocationBufferCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->dedicatedAllocation);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationBufferCreateInfoNV_setDedicatedAllocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationBufferCreateInfoNV* o = (VkDedicatedAllocationBufferCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dedicatedAllocation, valuePointer, sizeof(o->dedicatedAllocation));
}


