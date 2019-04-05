package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanInstanceCreateInfo extends VulkanObject {
    public VulkanInstanceCreateInfo(){
        super(new VkInstanceCreateInfo());
    }

    public VulkanInstanceCreateInfo(VkInstanceCreateInfo vk){
        super(vk);
    }

    @Override
    public VkInstanceCreateInfo getVk(){
        return (VkInstanceCreateInfo) super.getVk();
    }
    public VulkanInstanceCreateInfo(VulkanObject pNext, VulkanInstanceCreateFlags flags, VulkanApplicationInfo pApplicationInfo, VulkanUInt32 enabledLayerCount, VulkanChar.Pointer ppEnabledLayerNames, VulkanUInt32 enabledExtensionCount, VulkanChar.Pointer ppEnabledExtensionNames) {
        super(new VkInstanceCreateInfo(pNext.getVk(), flags.getVk(), pApplicationInfo.getVk(), enabledLayerCount.getVk(), ppEnabledLayerNames.getVk(), enabledExtensionCount.getVk(), ppEnabledExtensionNames.getVk()));
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

    public VulkanInstanceCreateFlags getFlags() {
        return new VulkanInstanceCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanInstanceCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanApplicationInfo getPApplicationInfo() {
        return new VulkanApplicationInfo(getVk().getPApplicationInfo());
    }

    public void setPApplicationInfo(VulkanApplicationInfo pApplicationInfo) {
        getVk().setPApplicationInfo(pApplicationInfo.getVk());
    }

    public VulkanUInt32 getEnabledLayerCount() {
        return new VulkanUInt32(getVk().getEnabledLayerCount());
    }

    public void setEnabledLayerCount(VulkanUInt32 enabledLayerCount) {
        getVk().setEnabledLayerCount(enabledLayerCount.getVk());
    }

    public VulkanChar.Pointer getPpEnabledLayerNames() {
        return new VulkanChar.Pointer(getVk().getPpEnabledLayerNames());
    }

    public void setPpEnabledLayerNames(VulkanChar.Pointer ppEnabledLayerNames) {
        getVk().setPpEnabledLayerNames(ppEnabledLayerNames.getVk());
    }

    public VulkanUInt32 getEnabledExtensionCount() {
        return new VulkanUInt32(getVk().getEnabledExtensionCount());
    }

    public void setEnabledExtensionCount(VulkanUInt32 enabledExtensionCount) {
        getVk().setEnabledExtensionCount(enabledExtensionCount.getVk());
    }

    public VulkanChar.Pointer getPpEnabledExtensionNames() {
        return new VulkanChar.Pointer(getVk().getPpEnabledExtensionNames());
    }

    public void setPpEnabledExtensionNames(VulkanChar.Pointer ppEnabledExtensionNames) {
        getVk().setPpEnabledExtensionNames(ppEnabledExtensionNames.getVk());
    }


    public static class Array extends VulkanInstanceCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanInstanceCreateInfo> {
        public Array(VkInstanceCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkInstanceCreateInfo.Array(count));
        }

        public Array(int count, VulkanInstanceCreateInfo o){
            this(new VkInstanceCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkInstanceCreateInfo.Array getVk(){
            return (VkInstanceCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanInstanceCreateInfo get(int i){
            return new VulkanInstanceCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkInstanceCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkInstanceCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkInstanceCreateInfo.Pointer(value));
        }

        @Override
        public VkInstanceCreateInfo.Pointer getVk(){
            return (VkInstanceCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanInstanceCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanInstanceCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkInstanceCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanInstanceCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkInstanceCreateInfo.Pointer.Array getVk(){
                return (VkInstanceCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanInstanceCreateInfo.Pointer get(int i){
                return new VulkanInstanceCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
