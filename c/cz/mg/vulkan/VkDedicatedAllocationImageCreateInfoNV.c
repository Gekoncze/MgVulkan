#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDedicatedAllocationImageCreateInfoNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDedicatedAllocationImageCreateInfoNV);
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationImageCreateInfoNV_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationImageCreateInfoNV* o = (VkDedicatedAllocationImageCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationImageCreateInfoNV_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationImageCreateInfoNV* o = (VkDedicatedAllocationImageCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationImageCreateInfoNV_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationImageCreateInfoNV* o = (VkDedicatedAllocationImageCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationImageCreateInfoNV_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationImageCreateInfoNV* o = (VkDedicatedAllocationImageCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationImageCreateInfoNV_getDedicatedAllocation(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationImageCreateInfoNV* o = (VkDedicatedAllocationImageCreateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->dedicatedAllocation);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationImageCreateInfoNV_setDedicatedAllocation(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationImageCreateInfoNV* o = (VkDedicatedAllocationImageCreateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->dedicatedAllocation, valuePointer, sizeof(o->dedicatedAllocation));
}


