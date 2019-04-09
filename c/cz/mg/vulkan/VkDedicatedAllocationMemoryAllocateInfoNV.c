#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkDedicatedAllocationMemoryAllocateInfoNV);
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_getImage(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->image);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_setImage(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->image, valuePointer, sizeof(o->image));
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_getBuffer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->buffer);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_setBuffer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->buffer, valuePointer, sizeof(o->buffer));
}


