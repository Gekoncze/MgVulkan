#include <vulkan/vulkan.h>
#include <jni.h>
#include <stdlib.h>
#include <string.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImportMemoryHostPointerInfoEXT_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImportMemoryHostPointerInfoEXT);
}

jlong Java_cz_mg_vulkan_VkImportMemoryHostPointerInfoEXT_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportMemoryHostPointerInfoEXT* o = (VkImportMemoryHostPointerInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkImportMemoryHostPointerInfoEXT_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportMemoryHostPointerInfoEXT* o = (VkImportMemoryHostPointerInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkImportMemoryHostPointerInfoEXT_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportMemoryHostPointerInfoEXT* o = (VkImportMemoryHostPointerInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkImportMemoryHostPointerInfoEXT_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportMemoryHostPointerInfoEXT* o = (VkImportMemoryHostPointerInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkImportMemoryHostPointerInfoEXT_getHandleType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportMemoryHostPointerInfoEXT* o = (VkImportMemoryHostPointerInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(&o->handleType);
}

void Java_cz_mg_vulkan_VkImportMemoryHostPointerInfoEXT_setHandleType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportMemoryHostPointerInfoEXT* o = (VkImportMemoryHostPointerInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->handleType, valuePointer, sizeof(o->handleType));
}

jlong Java_cz_mg_vulkan_VkImportMemoryHostPointerInfoEXT_getPHostPointer(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportMemoryHostPointerInfoEXT* o = (VkImportMemoryHostPointerInfoEXT*)jniLongToPointer(address);
    return jniPointerToLong(o->pHostPointer);
}

void Java_cz_mg_vulkan_VkImportMemoryHostPointerInfoEXT_setPHostPointer(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportMemoryHostPointerInfoEXT* o = (VkImportMemoryHostPointerInfoEXT*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pHostPointer, &valuePointer, sizeof(o->pHostPointer));
}


