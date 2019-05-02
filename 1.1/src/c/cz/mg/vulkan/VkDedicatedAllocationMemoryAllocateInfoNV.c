#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

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

void Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkDedicatedAllocationMemoryAllocateInfoNV));
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_getImageNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->image);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_setImageNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->image, valuePointer, sizeof(o->image));
}

jlong Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_getBufferNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    return jniPointerToLong(&o->buffer);
}

void Java_cz_mg_vulkan_VkDedicatedAllocationMemoryAllocateInfoNV_setBufferNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkDedicatedAllocationMemoryAllocateInfoNV* o = (VkDedicatedAllocationMemoryAllocateInfoNV*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->buffer, valuePointer, sizeof(o->buffer));
}


