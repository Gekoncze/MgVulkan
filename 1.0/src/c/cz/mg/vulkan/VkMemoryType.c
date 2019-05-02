#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

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

void Java_cz_mg_vulkan_VkMemoryType_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkMemoryType));
}

jlong Java_cz_mg_vulkan_VkMemoryType_getPropertyFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryType* o = (VkMemoryType*)jniLongToPointer(address);
    return jniPointerToLong(&o->propertyFlags);
}

void Java_cz_mg_vulkan_VkMemoryType_setPropertyFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryType* o = (VkMemoryType*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->propertyFlags, valuePointer, sizeof(o->propertyFlags));
}

jlong Java_cz_mg_vulkan_VkMemoryType_getHeapIndexNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryType* o = (VkMemoryType*)jniLongToPointer(address);
    return jniPointerToLong(&o->heapIndex);
}

void Java_cz_mg_vulkan_VkMemoryType_setHeapIndexNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryType* o = (VkMemoryType*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->heapIndex, valuePointer, sizeof(o->heapIndex));
}


