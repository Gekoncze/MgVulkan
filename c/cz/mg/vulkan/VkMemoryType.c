#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkMemoryType_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkMemoryType);
}

jlong Java_cz_mg_vulkan_VkMemoryType_getPropertyFlags(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryType* o = (VkMemoryType*)jniLongToPointer(address);
    return jniPointerToLong(&o->propertyFlags);
}

void Java_cz_mg_vulkan_VkMemoryType_setPropertyFlags(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryType* o = (VkMemoryType*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->propertyFlags, valuePointer, sizeof(o->propertyFlags));
}

jlong Java_cz_mg_vulkan_VkMemoryType_getHeapIndex(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryType* o = (VkMemoryType*)jniLongToPointer(address);
    return jniPointerToLong(&o->heapIndex);
}

void Java_cz_mg_vulkan_VkMemoryType_setHeapIndex(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryType* o = (VkMemoryType*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->heapIndex, valuePointer, sizeof(o->heapIndex));
}


