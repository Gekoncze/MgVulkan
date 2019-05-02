#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkMemoryHostPointerPropertiesEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkMemoryHostPointerPropertiesEXT);
}

void Java_cz_mg_vulkan_VkMemoryHostPointerPropertiesEXT_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkMemoryHostPointerPropertiesEXT));
}

jlong Java_cz_mg_vulkan_VkMemoryHostPointerPropertiesEXT_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryHostPointerPropertiesEXT* o = (VkMemoryHostPointerPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkMemoryHostPointerPropertiesEXT_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryHostPointerPropertiesEXT* o = (VkMemoryHostPointerPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkMemoryHostPointerPropertiesEXT_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryHostPointerPropertiesEXT* o = (VkMemoryHostPointerPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkMemoryHostPointerPropertiesEXT_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryHostPointerPropertiesEXT* o = (VkMemoryHostPointerPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkMemoryHostPointerPropertiesEXT_getMemoryTypeBitsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkMemoryHostPointerPropertiesEXT* o = (VkMemoryHostPointerPropertiesEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->memoryTypeBits);
}

void Java_cz_mg_vulkan_VkMemoryHostPointerPropertiesEXT_setMemoryTypeBitsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkMemoryHostPointerPropertiesEXT* o = (VkMemoryHostPointerPropertiesEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->memoryTypeBits, valuePointer, sizeof(o->memoryTypeBits));
}


