#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImportMemoryFdInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImportMemoryFdInfoKHR);
}

jlong Java_cz_mg_vulkan_VkImportMemoryFdInfoKHR_getSType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportMemoryFdInfoKHR* o = (VkImportMemoryFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkImportMemoryFdInfoKHR_setSType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportMemoryFdInfoKHR* o = (VkImportMemoryFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkImportMemoryFdInfoKHR_getPNext(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportMemoryFdInfoKHR* o = (VkImportMemoryFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkImportMemoryFdInfoKHR_setPNext(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportMemoryFdInfoKHR* o = (VkImportMemoryFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkImportMemoryFdInfoKHR_getHandleType(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportMemoryFdInfoKHR* o = (VkImportMemoryFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->handleType);
}

void Java_cz_mg_vulkan_VkImportMemoryFdInfoKHR_setHandleType(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportMemoryFdInfoKHR* o = (VkImportMemoryFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->handleType, valuePointer, sizeof(o->handleType));
}

jlong Java_cz_mg_vulkan_VkImportMemoryFdInfoKHR_getFd(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportMemoryFdInfoKHR* o = (VkImportMemoryFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->fd);
}

void Java_cz_mg_vulkan_VkImportMemoryFdInfoKHR_setFd(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportMemoryFdInfoKHR* o = (VkImportMemoryFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fd, valuePointer, sizeof(o->fd));
}


