package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanLayerProperties extends VulkanObject {
    public VulkanLayerProperties(){
        super(new VkLayerProperties());
    }

    public VulkanLayerProperties(VkLayerProperties vk){
        super(vk);
    }

    @Override
    public VkLayerProperties getVk(){
        return (VkLayerProperties) super.getVk();
    }

    public VulkanLayerProperties(VulkanChar layerName, VulkanUInt32 specVersion, VulkanUInt32 implementationVersion, VulkanChar description) {
        super(new VkLayerProperties(layerName.getVk(), specVersion.getVk(), implementationVersion.getVk(), description.getVk()));
    }

    public VulkanChar getLayerName() {
        return new VulkanChar(getVk().getLayerName());
    }

    public void setLayerName(VulkanChar layerName) {
        getVk().setLayerName(layerName.getVk());
    }

    public VulkanUInt32 getSpecVersion() {
        return new VulkanUInt32(getVk().getSpecVersion());
    }

    public void setSpecVersion(VulkanUInt32 specVersion) {
        getVk().setSpecVersion(specVersion.getVk());
    }

    public VulkanUInt32 getImplementationVersion() {
        return new VulkanUInt32(getVk().getImplementationVersion());
    }

    public void setImplementationVersion(VulkanUInt32 implementationVersion) {
        getVk().setImplementationVersion(implementationVersion.getVk());
    }

    public VulkanChar getDescription() {
        return new VulkanChar(getVk().getDescription());
    }

    public void setDescription(VulkanChar description) {
        getVk().setDescription(description.getVk());
    }


    public static class Array extends VulkanLayerProperties implements cz.mg.collections.array.ReadonlyArray<VulkanLayerProperties> {
        public Array(VkLayerProperties.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkLayerProperties.Array(count));
        }

        public Array(int count, VulkanLayerProperties o){
            this(new VkLayerProperties.Array(count, o.getVk()));
        }

        @Override
        public VkLayerProperties.Array getVk(){
            return (VkLayerProperties.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanLayerProperties get(int i){
            return new VulkanLayerProperties(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkLayerProperties.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkLayerProperties.Pointer());
        }

        public Pointer(long value) {
            this(new VkLayerProperties.Pointer(value));
        }

        @Override
        public VkLayerProperties.Pointer getVk(){
            return (VkLayerProperties.Pointer) super.getVk();
        }

        public static class Array extends VulkanLayerProperties.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanLayerProperties.Pointer> {
            public Array(int count) {
                super(new VkLayerProperties.Pointer.Array(count));
            }

            public Array(VulkanLayerProperties[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkLayerProperties.Pointer.Array getVk(){
                return (VkLayerProperties.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanLayerProperties.Pointer get(int i){
                return new VulkanLayerProperties.Pointer(getVk().get(i));
            }
        }
    }
}
