#include <jni.h>
#include <stdlib.h>
#include <string.h>
#include <vulkan/vulkan.h>

jlong jniPointerToLong(const void* p);
void* jniLongToPointer(jlong l);
jlong jniFunctionPointerToLong(PFN_vkVoidFunction p);
PFN_vkVoidFunction jniLongToFunctionPointer(jlong l);
void jniThrowException(JNIEnv* env, const char* message);

jlong Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_sizeof(JNIEnv* env, jclass jc)
{
    (void)env;
    (void)jc;
    return sizeof(VkImportFenceFdInfoKHR);
}

void Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_setNative(JNIEnv* env, jclass jc, jlong o1, jlong o2)
{
    (void)env;
    (void)jc;
    memcpy(jniLongToPointer(o1), jniLongToPointer(o2), sizeof(VkImportFenceFdInfoKHR));
}

jlong Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_getSTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->sType);
}

void Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_setSTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->sType, valuePointer, sizeof(o->sType));
}

jlong Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_getPNextNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(o->pNext);
}

void Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_setPNextNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->pNext, &valuePointer, sizeof(o->pNext));
}

jlong Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_getFenceNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->fence);
}

void Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_setFenceNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fence, valuePointer, sizeof(o->fence));
}

jlong Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_getFlagsNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->flags);
}

void Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_setFlagsNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->flags, valuePointer, sizeof(o->flags));
}

jlong Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_getHandleTypeNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->handleType);
}

void Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_setHandleTypeNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->handleType, valuePointer, sizeof(o->handleType));
}

jlong Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_getFdNative(JNIEnv* env, jclass jc, jlong address)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    return jniPointerToLong(&o->fd);
}

void Java_cz_mg_vulkan_VkImportFenceFdInfoKHR_setFdNative(JNIEnv* env, jclass jc, jlong address, jlong valueAddress)
{
    (void)env;
    (void)jc;
    VkImportFenceFdInfoKHR* o = (VkImportFenceFdInfoKHR*)jniLongToPointer(address);
    void* valuePointer = jniLongToPointer(valueAddress);
    memcpy(&o->fd, valuePointer, sizeof(o->fd));
}


