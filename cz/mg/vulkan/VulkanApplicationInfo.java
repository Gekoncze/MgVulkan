package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkApplicationInfo.html">khronos documentation</a>
 **/
public class VulkanApplicationInfo extends VulkanObject {
    public VulkanApplicationInfo(){
        super(new VkApplicationInfo());
    }

    public VulkanApplicationInfo(VkApplicationInfo vk){
        super(vk);
    }

    @Override
    public VkApplicationInfo getVk(){
        return (VkApplicationInfo) super.getVk();
    }
    public VulkanApplicationInfo(VulkanObject pNext, VulkanChar pApplicationName, VulkanUInt32 applicationVersion, VulkanChar pEngineName, VulkanUInt32 engineVersion, VulkanUInt32 apiVersion) {
        super(new VkApplicationInfo(pNext.getVk(), pApplicationName.getVk(), applicationVersion.getVk(), pEngineName.getVk(), engineVersion.getVk(), apiVersion.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanChar getPApplicationName() {
        return new VulkanChar(getVk().getPApplicationName());
    }

    public void setPApplicationName(VulkanChar pApplicationName) {
        getVk().setPApplicationName(pApplicationName.getVk());
    }

    public VulkanUInt32 getApplicationVersion() {
        return new VulkanUInt32(getVk().getApplicationVersion());
    }

    public void setApplicationVersion(VulkanUInt32 applicationVersion) {
        getVk().setApplicationVersion(applicationVersion.getVk());
    }

    public VulkanChar getPEngineName() {
        return new VulkanChar(getVk().getPEngineName());
    }

    public void setPEngineName(VulkanChar pEngineName) {
        getVk().setPEngineName(pEngineName.getVk());
    }

    public VulkanUInt32 getEngineVersion() {
        return new VulkanUInt32(getVk().getEngineVersion());
    }

    public void setEngineVersion(VulkanUInt32 engineVersion) {
        getVk().setEngineVersion(engineVersion.getVk());
    }

    public VulkanUInt32 getApiVersion() {
        return new VulkanUInt32(getVk().getApiVersion());
    }

    public void setApiVersion(VulkanUInt32 apiVersion) {
        getVk().setApiVersion(apiVersion.getVk());
    }


    public static class Array extends VulkanApplicationInfo implements cz.mg.collections.array.ReadonlyArray<VulkanApplicationInfo> {
        public Array(VkApplicationInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkApplicationInfo.Array(count));
        }

        public Array(int count, VulkanApplicationInfo o){
            this(new VkApplicationInfo.Array(count, o.getVk()));
        }

        @Override
        public VkApplicationInfo.Array getVk(){
            return (VkApplicationInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanApplicationInfo get(int i){
            return new VulkanApplicationInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkApplicationInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkApplicationInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkApplicationInfo.Pointer(value));
        }

        @Override
        public VkApplicationInfo.Pointer getVk(){
            return (VkApplicationInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanApplicationInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanApplicationInfo.Pointer> {
            public Array(int count) {
                super(new VkApplicationInfo.Pointer.Array(count));
            }

            public Array(VulkanApplicationInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkApplicationInfo.Pointer.Array getVk(){
                return (VkApplicationInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanApplicationInfo.Pointer get(int i){
                return new VulkanApplicationInfo.Pointer(getVk().get(i));
            }
        }
    }
}
